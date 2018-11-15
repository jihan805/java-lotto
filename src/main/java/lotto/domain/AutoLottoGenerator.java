package lotto.domain;

import lotto.utils.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class AutoLottoGenerator implements Generator {

    @Override
    public List<Ticket> generate() {
        List<Ticket> tickets =  new ArrayList<>();

        IntStream.range(0, Money.countAutoGeneratedTicket())
                .mapToObj(i -> new Ticket(Utils.generateRandomNumbers()))
                .forEach(ticket -> tickets.add(ticket));

        return tickets;
    }

}
