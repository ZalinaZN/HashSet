import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    private Set<String> word;

    public WordsChecker(String text) {
        this.word = new HashSet<>(List.
                of(text.split
                        ("\\P{IsAlphabetic}+"))); // разбиваем текст на слова по пробелу
            }
    public boolean hasWord(String words) {
        return word.contains(words);  // сравниваем слово из текста со словом переданным в метод.
    }

}
