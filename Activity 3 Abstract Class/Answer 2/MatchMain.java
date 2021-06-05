import java.util.Scanner;

public class MatchMain {

    public static void main(String[] args) {
        int curr,score,ball;
        float over,rrr;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the match format");
        System.out.println("1. ODI");
        System.out.println("2. T20");
        System.out.println("3. Test");
        int ch=s.nextInt();
        Match match;
        switch(ch){
            case 1:
                ODIMatch obj1=new ODIMatch();
                match=obj1;
                System.out.println("Enter the Current Score");
                curr=s.nextInt();
                System.out.println("Enter the Current Over");
                over=s.nextFloat();
                System.out.println("Enter the Target Score");
                score=s.nextInt();
                match.setValue(curr, over, score);
                rrr=match.calculateRunRate();
                ball=match.calculateBalls();
                match.display(rrr, ball);
                break;

            case 2:
                T20Match obj2=new T20Match();
                match=obj2;
                System.out.println("Enter the Current Score");
                curr=s.nextInt();
                System.out.println("Enter the Current Over");
                over=s.nextFloat();
                System.out.println("Enter the Target Score");
                score=s.nextInt();
                match.setValue(curr, over, score);
                rrr=match.calculateRunRate();
                ball=match.calculateBalls();
                match.display(rrr, ball);

            case 3:
                TestMatch obj3=new TestMatch();
                match=obj3;
                System.out.println("Enter the Current Score");
                curr=s.nextInt();
                System.out.println("Enter the Current Over");
                over=s.nextFloat();
                System.out.println("Enter the Target Score");
                score=s.nextInt();
                match.setValue(curr, over, score);
                rrr=match.calculateRunRate();
                ball=match.calculateBalls();
                match.display(rrr, ball);

        }

    }
}