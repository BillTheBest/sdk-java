package com.manywho.sdk.services.controllers;

import com.manywho.sdk.api.run.elements.type.FileDataRequest;
import com.manywho.sdk.api.run.elements.type.ObjectDataResponse;
import com.manywho.sdk.services.files.FileManager;
import com.manywho.sdk.services.files.FileUpload;
import com.manywho.sdk.services.files.FileUploadService;
import org.jboss.resteasy.plugins.providers.multipart.MultipartInput;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("/file")
public class DefaultFileController extends AbstractFileController {
    private final FileManager fileManager;

    @Inject
    public DefaultFileController(FileManager fileManager) {
        this.fileManager = fileManager;
    }

    @Override
    public ObjectDataResponse deleteFile(FileDataRequest fileDataRequest) throws Exception {
        throw new UnsupportedOperationException("Deleting files is not yet supported in the SDK");
    }

    @Override
    public ObjectDataResponse loadFiles(FileDataRequest fileDataRequest) throws Exception {
        return fileManager.loadFiles(fileDataRequest);
    }

    @Override
    public ObjectDataResponse uploadFile(MultipartInput multipartInput) throws Exception {
        // Get the first part that has a content type of "application/json", as it's probably the FileDataRequest
        FileDataRequest request = multipartInput.getParts().stream()
                .filter(bodyPart -> bodyPart.getMediaType().toString().contains("application/json"))
                .findFirst()
                .map(FileUploadService::getFileDataRequest)
                .orElseThrow(() -> new RuntimeException("No file metadata was sent in the request"));

        // Get the first part that doesn't have a content type of "application/json" as it's probably the file content
        FileUpload upload = multipartInput.getParts().stream()
                .filter(bodyPart -> !bodyPart.getMediaType().toString().contains("application/json"))
                .findFirst()
                .map(FileUploadService::createFileUpload)
                .orElseThrow(() -> new RuntimeException("No file was uploaded"));

        return fileManager.uploadFile(request, upload);
    }
}
