package com.student.java.module03.task1;
import java.util.List;

public class Folder {
    List<File>fileLists;
    List<Folder>folderLists;

    public List<Folder> getFolderLists() {
        return folderLists;
    }

    public List<File> getFileLists() {
        return fileLists;
    }
    public boolean addFile(File file){
        return fileLists.add(file);
    }

}
