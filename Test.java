package edu.Multimedia;

import java.io.*;

public class Test {
        public static void main(String[] args){

            HuffmanCompress sample = new HuffmanCompress();
            //ѹ��
//		    File inputFile = new File("wsc-compress.txt");
//		    File outputFile = new File("wsc-compress.rar");
//		    sample.compress(inputFile, outputFile);
//		    System.out.println("�ļ�ѹ���ɹ���");

            //��ѹ
          File inputFile = new File("wsc-compress.rar");
          File outputFile = new File("wsc-extract.txt");
          sample.extract(inputFile, outputFile);
            System.out.println("�ļ���ѹ�ɹ���");
        }
    }

