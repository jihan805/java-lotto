package lotto.view;

import lotto.domain.GameResult;
import lotto.domain.Ticket;
import lotto.enums.MatchType;

import java.util.List;

public class ResultView {

    public static void printLottoTicketCount(int num) {
        System.out.println(num + "개를 구매했습니다.");
    }

    public static void printTickets(List<Ticket> tickets) {
        tickets.forEach(ticket -> System.out.println("[" + ticket.toString() + "]"));
        System.out.println();
    }

    public static void printLottoResults(GameResult gameResult) {
        System.out.println("3개 일치 (5000원)- " + MatchType.THREE.getCount());
        System.out.println("4개 일치 (50000원)- " + MatchType.FOUR.getCount());
        System.out.println("5개 일치 (1500000원)- " + MatchType.FIVE.getCount());
        System.out.println("6개 일치 (2000000000원)- " + MatchType.SIX.getCount());
        System.out.println("총 수익률은 " + gameResult.getBenefitRate() + "입니다.");
    }
}
