package nextstep.ladder;

import nextstep.ladder.domain.Peoples;
import nextstep.ladder.view.InputView;

public class LadderGameMain {

    public static void main(String[] args) {
        String peopleString = InputView.inputPeoples();
        Peoples peoples = Peoples.parse(peopleString);
    }
}