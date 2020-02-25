package com.example.homework.components;

import com.example.homework.models.File;
import com.example.homework.models.Folder;
import com.example.homework.models.User;
import com.example.homework.repos.FileRepo;
import com.example.homework.repos.FolderRepo;
import com.example.homework.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepo fileRepo;

    @Autowired
    FolderRepo folderRepo;

    @Autowired
    UserRepo userRepo;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        User user = new User("siggy");
        userRepo.save(user);
        
        Folder folder = new Folder("Codeclan", user);
        folderRepo.save(folder);

        File file = new File("test", "test", "Twelve gb", folder);
        fileRepo.save(file);

        File file1 = new File("Coding", "jpg", "11 gb", folder);
        fileRepo.save(file1);

        File file2 = new File("Work", "jpg", "10 gb", folder);
        fileRepo.save(file2);
    }
}
