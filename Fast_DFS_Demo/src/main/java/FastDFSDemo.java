import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient1;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;



public class FastDFSDemo {

    public static void main(String[] args) throws Exception {

        //使用流读取配置文件
        //要获取的是绝对路劲
        ClientGlobal.init("E:\\javaproject\\Fast_DFS_Demo\\src\\main\\resources\\fdfs_client.conf");

        //创建tracker客户端
        TrackerClient trackerClient = new TrackerClient();

        //连接tracker
        TrackerServer connection = trackerClient.getConnection();
        //创建Storage客户端
        StorageClient1 storageClient1 = new StorageClient1(connection, null);

        String path = storageClient1.upload_file1("C:\\Users\\SHKJ\\Pictures\\Saved Pictures\\微信图片_201804291730395.jpg", "jpg", null);

        System.out.println("http://192.168.200.128/"+path);


    }
}
