package com.example.homework.repos;

import com.example.homework.models.File;
import com.example.homework.models.Folder;
import com.example.homework.projections.EmbedFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFolder.class)
public interface FileRepo extends JpaRepository<File, Long> {
}
