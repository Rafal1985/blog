package pl.sarnecki.readarticleretriever;

import lombok.Builder;

@Builder public record ArticleDto(Long id, String header, String content, String category) {
}
