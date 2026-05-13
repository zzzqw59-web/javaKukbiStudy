package primitive.example.exam_switch;

public class SwitchExampleRef {
    static void main(String[] args) {
        String medal = "Gold";

        String message = switch (medal) {
            case "Gold" -> "금메달입니다.";
            case "Silber" -> "은메달입니다.";
            case "Bronze" -> "동메달입니다.";
            default -> "메달이 없습니다.";
        };

        System.out.println(message);
    }
}
