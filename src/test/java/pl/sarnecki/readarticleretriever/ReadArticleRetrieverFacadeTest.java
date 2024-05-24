package pl.sarnecki.readarticleretriever;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReadArticleRetrieverFacadeTest {

    @Test
    public void f(){
        //give
        ReadArticleRetrieverFacade facade = new ReadArticleRetrieverFacade();
        //when
        ArticleDto articleDto=facade.retrieveById(1L);
        //then
    }




}