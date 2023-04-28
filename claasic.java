import java.util.Random;

public class claasic {
    public static void main(String[] args) {
        // 단어 목록 생성
        String[] words = {"https://youtu.be/MhHxVaJ9sT4",
                "https://youtu.be/J6LcGg2xnwk",
                "https://youtu.be/mlFDY5TMgeg",
                "https://youtu.be/xl6qDlPCTUM",
                "https://youtu.be/rqAl6ijtt0M",
                "https://youtu.be/bfcL8KqpgKs",
                "https://youtu.be/oeLHy3dIiXs",
                "https://youtu.be/nEh432koJH4",
                "https://youtu.be/iFyo02cPJmw",
                "https://youtu.be/8uZ0y_lFg5s",
                "https://youtu.be/IicjexhNel0",
                "https://youtu.be/AULG4MoYxQk",
                "https://youtu.be/hG1gbOjWWdI",
                "https://youtu.be/7maJOI3QMu0",
                "https://youtu.be/ov8-BEsEPCY",
                "https://youtu.be/LsAsJUTsYxs",
                "https://youtu.be/Kus75rHg930",
                "https://youtu.be/QMMJa2lD8xU",
                "https://youtu.be/EuSmZzLG1xI",
                "https://youtu.be/URgC4hOfen8",
                "https://youtu.be/tADg_y1VVFw",
                "https://youtu.be/tbpa14XvgnQ"};

        // Random 객체 생성
        Random random = new Random();

        // 단어 목록에서 랜덤한 단어 선택
        String randomWord = words[random.nextInt(words.length)];

        // 선택된 랜덤한 단어 출력
        System.out.println("Random word: " + randomWord);
    }
}
