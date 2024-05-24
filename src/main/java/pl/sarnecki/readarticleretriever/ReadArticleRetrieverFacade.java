package pl.sarnecki.readarticleretriever;

public class ReadArticleRetrieverFacade {
//podaje artumentyy przez konstruktor
    public ArticleDto retrieveById(Long id) {
        /*return new ArticleDto(1L,
                "Jak zostać programistą Java",
                "5 kroków: 1, 2, 3, 4, 5",
                "IT"
        );*/

//używam buildera-lombok, jeśli nei wypełnie wszystkich metod, poozostałe przyjmują wartosci domyślne
    return ArticleDto.builder()
            .id(1L)
            .header("Jak zostać programistą Java")
            .content("5 kroków: 1, 2, 3, 4, 5")
            .category("IT")
            .build();
    }
}
