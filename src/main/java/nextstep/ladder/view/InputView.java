package nextstep.ladder.view;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String INPUT_PEOPLES_MESSAGE = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";

    public static String inputPeoples() {
        System.out.println(INPUT_PEOPLES_MESSAGE);
        return scanner.nextLine();
    }
}