package mpo.dayon.common.network.message;

import java.io.Serializable;
import java.util.Objects;

public class FileMetaData implements Serializable {
    private final String fileName;
    private final long fileSize;

    public FileMetaData(String fileName, long fileSize, String basePath) {
        this.fileName = fileName.replace(basePath, "");
        this.fileSize = fileSize;
    }

    public String getFileName() {
        return fileName;
    }

    public long getFileSize() {
        return fileSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FileMetaData that = (FileMetaData) o;

        if (fileSize != that.fileSize) return false;
        return Objects.equals(fileName, that.fileName);
    }

    @Override
    public int hashCode() {
        int result = fileName != null ? fileName.hashCode() : 0;
        result = 31 * result + (int) (fileSize ^ (fileSize >>> 32));
        return result;
    }
}
