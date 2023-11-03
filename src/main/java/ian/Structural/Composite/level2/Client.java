package ian.Structural.Composite.level2;

class Client {
    public static void main(String[] args) {
        DirectoryNode root = new DirectoryNode("C:");
        FileNode image1 = new FileNode("image1.jpg");
        FileNode image2 = new FileNode("image2.jpg");
//第二層
        DirectoryNode musicDir = new DirectoryNode("music");
        FileNode music1 = new FileNode("music1.mp3");
        DirectoryNode videoDir = new DirectoryNode("video");
        FileNode video1 = new FileNode("video1.mp4");
        FileNode video2 = new FileNode("video2.mp4");
//第三層
        DirectoryNode chineseStyleDir = new DirectoryNode("chineseStyle");
        FileNode chineseMusic = new FileNode("chineseMusic.mp3");

        root.add(image1, image2);
        root.add(musicDir);
        musicDir.add(music1);
        root.add(videoDir);
        videoDir.add(video1, video2);
        musicDir.add(chineseStyleDir);
        chineseStyleDir.add(chineseMusic);

        root.displayAbsolutePath();
        System.out.println("=== root remove musicDir ===");
        root.remove(musicDir);// 斷開節點，後面就全沒了
        System.out.println("=== root ===");
        root.displayAbsolutePath();
        System.out.println("=== musicDir ===");
        musicDir.displayAbsolutePath();
    }
}
