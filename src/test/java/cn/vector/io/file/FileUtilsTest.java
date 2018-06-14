package cn.vector.io.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

/**
 * @Author : Huang Vector ( hgw )
 * @Date : 2018-6-14 14:53
 */
public class FileUtilsTest {
    @Test
    public void listDirectoryTest()  {
        try {
            FileUtils.listDirectory(new File("F:\\tmp\\vector"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}