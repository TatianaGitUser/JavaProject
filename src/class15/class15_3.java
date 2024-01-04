package class15;

public class class15_3 {
    public static void main(String[] args) {
        String textFormat = ".gif3";
        switch (textFormat){
                case ".txt":
                case ".doc":
                case ".docx":
                System.out.println("Sending a text file");
                break;
            case ".jpg":
            case ".png":
            case".gif":
                System.out.println("Attaching an image file");
        break;
            case ".mp3":
            case ".wma":
            case ".ogg":
                System.out.println("Attaching an audio file");
                break;
            default:
                System.out.println(textFormat +" is an Unsupported file type");
        }
    }
}
