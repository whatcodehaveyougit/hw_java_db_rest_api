package com.example.homework.projections;

import com.example.homework.models.File;
import com.example.homework.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFolder", types = File.class)
public interface EmbedFolder {
    String getName();
    String getExtension();
    String getSize();
    Folder getFolder();
}