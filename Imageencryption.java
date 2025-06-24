package projects;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;

public class ImageEncryption {

    public static void main(String[] args) throws IOException {
       
        BufferedImage bi = ImageIO.read(new File("C:/Users/folder1/folder2 /your_image.jpg"));//folder 2 is placed inside folder1

        int width = bi.getWidth();
        int height = bi.getHeight();
        int totalSwaps = width * height;

        int[][] swapData = new int[totalSwaps][4];
        Random rand = new Random(12345); 
        
        for (int i = 0; i < totalSwaps; i++) {
            int x1 = rand.nextInt(width);
            int y1 = rand.nextInt(height);
            int x2 = rand.nextInt(width);
            int y2 = rand.nextInt(height);

            int pixel1 = bi.getRGB(x1, y1);
            int pixel2 = bi.getRGB(x2, y2);

            bi.setRGB(x1, y1, pixel2);
            bi.setRGB(x2, y2, pixel1);

            swapData[i][0] = x1;
            swapData[i][1] = y1;
            swapData[i][2] = x2;
            swapData[i][3] = y2;
        }

       
        ImageIO.write(bi, "jpg", new File("C:/Users/folder1/folder2 /scrambled_image.jpg"));//folder 2 is placed inside folder1
        System.out.println("Encrypted image saved!");

        
        for (int i = totalSwaps - 1; i >= 0; i--) {
            int x1 = swapData[i][0];
            int y1 = swapData[i][1];
            int x2 = swapData[i][2];
            int y2 = swapData[i][3];

            int pixel1 = bi.getRGB(x1, y1);
            int pixel2 = bi.getRGB(x2, y2);

            bi.setRGB(x1, y1, pixel2);
            bi.setRGB(x2, y2, pixel1);
        }

     
        ImageIO.write(bi, "jpg", new File("C:/Users/folder1/folder2 /decrypt_file.jpg"));//folder 2 is placed inside folder1
        System.out.println("Decrypted image saved!");
    }
}

