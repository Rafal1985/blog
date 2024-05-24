package pl.sarnecki.readarticleretriever;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReadArticleRetrieverFacadeTest {

    @Test
    @DisplayName("should return article with id 1 and content costam")
    public void should_return_article_with_id_1_and_content_costam() {
        //give
        ReadArticleRetrieverFacade facade = new ReadArticleRetrieverFacade();
        //when
        ArticleDto articleDto = facade.retrieveById(1L);
        //then
        assert articleDto.id().equals(1L);
        assert articleDto.header().equals("Jak zostać programistą Java");
        assert articleDto.content().equals("5 kroków: 1, 2, 3, 4, 5");
        assert articleDto.category().equals("IT");


    }
}