public class Main {
    public static void main(String[] args) {

    WordsChecker wordsChecker = new WordsChecker("У Лукоморья дуб зеленый, " +
            "злотая цепь на дубе том. И днем и ночью кот ученый все ходит по цепи кругом.");

        System.out.println(wordsChecker.hasWord("русалка"));
    }

}