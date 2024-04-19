import java.security.PublicKey;

public class Ex4_04 {
    String title;
    Stirng author;
    
    public Book(String t) { //생성자
        title = t;
        author = "작자미상"; 

    }

    Public Book(Stirng t, String a) { //생성자
        Book littlePrince = new Book("어린왕자", "생텍쥐페리"); //생성자 Book (String t, String a)호출
        Book loveStory = new Book("춘향전"); //생성자 Book(String t)호출
        System.out.pringln(littlePrince.title + " " + littlePrince.author);
        System.out.println(loveStory.title + " " + loveStory.author);
    }
}
