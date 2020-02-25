//package com.example.homework;
//
//import com.example.homework.models.File;
//import com.example.homework.models.Folder;
//import com.example.homework.repos.FileRepo;
//import com.example.homework.repos.FolderRepo;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//class HomeworkApplicationTests {
//
//	@Autowired
//	FileRepo fileRepo;
//
//	@Autowired
//	FolderRepo folderRepo;
//
//	@Test
//	void contextLoads() {
//	}
//
//	@Test
//	public void canCreateFolderAndFile() {
//		Folder folder = new Folder("Codeclan" );
//		folderRepo.save(folder);
//
//		File file = new File("test", "test", "12gb", folder);
//		fileRepo.save(file);
//	}
//
//
//
//
//}
