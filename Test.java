package edu.Multimedia;

import java.io.*;

public class Test {
        public static void main(String[] args){

            HuffmanCompress sample = new HuffmanCompress();
            //压缩
//		    File inputFile = new File("wsc-compress.txt");
//		    File outputFile = new File("wsc-compress.rar");
//		    sample.compress(inputFile, outputFile);
//		    System.out.println("文件压缩成功。");

            //解压
          File inputFile = new File("wsc-compress.rar");
          File outputFile = new File("wsc-extract.txt");
          sample.extract(inputFile, outputFile);
            System.out.println("文件解压成功。");
        }
    }

