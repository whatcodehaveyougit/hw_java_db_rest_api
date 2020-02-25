package com.example.homework.projections;

import com.example.homework.models.File;
import com.example.homework.models.Folder;
import com.example.homework.models.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedUser", types = Folder.class)
public interface EmbedUser {
    String getTitle();
    File getFiles();
    User getUser();
}