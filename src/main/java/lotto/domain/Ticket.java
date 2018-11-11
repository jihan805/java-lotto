package lotto.domain;

import lotto.enums.MatchType;

import java.util.List;
import java.util.stream.Collectors;

public class Ticket {

    private List<Integer> numbers;

    public Ticket(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return this.numbers;
    }

    public int compareWinningLotto(WinningLotto winningLotto) {
        int count = getCountOfMatches(winningLotto.getNumbers());

        if(count == MatchType.FIVE.getMatch() && hasBonus(winningLotto.getBonus()))
            return MatchType.BONUS.getMatch();

        return count;
    }

    protected int getCountOfMatches(List<Integer> winningNumbers) {
        return (int) this.numbers.stream()
                .filter(winningNumbers::contains)
                .count();
    }

    protected boolean hasBonus(int bonus) {
        return numbers.contains(bonus);
    }

    @Override
    public String toString() {
        return numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(","));
    }
}
