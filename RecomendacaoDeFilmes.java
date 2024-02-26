import java.util.HashMap;

public class RecomendacaoDeFilmes {

  public static void main(String[] args) {
    // Dados históricos de filmes assistidos e notas atribuídas pelo usuário
    HashMap<String, Double> filmesAssistidos = new HashMap<>();
    filmesAssistidos.put("Star Wars", 4.5);
    filmesAssistidos.put("Harry Potter", 4.0);
    filmesAssistidos.put("Senhor dos Anéis", 4.8);
    filmesAssistidos.put("Matrix", 4.2);
    filmesAssistidos.put("Vingadores", 4.7);

    // Chama a função para gerar recomendações de filmes
    HashMap<String, Double> recomendacoes = gerarRecomendacoes(filmesAssistidos);

    // Exibe as recomendações para o usuário
    System.out.println("Recomendações de filmes para você:");
    for (String filme : recomendacoes.keySet()) {
      System.out.println(filme + " - Nota prevista: " + recomendacoes.get(filme));
    }
  }

  // Função para gerar recomendações de filmes com base nos filmes já assistidos e
  // na nota mínima
  public static HashMap<String, Double> gerarRecomendacoes(HashMap<String, Double> filmesAssistidos) {
    // Suponha que tenhamos dados históricos de notas médias para alguns filmes
    HashMap<String, Double> notasMedias = new HashMap<>();
    notasMedias.put("Star Wars", 4.4);
    notasMedias.put("Harry Potter", 4.2);
    notasMedias.put("Senhor dos Anéis", 4.6);
    notasMedias.put("Matrix", 4.3);
    notasMedias.put("Vingadores", 4.5);

    // Vamos verificar os filmes não assistidos pelo usuário e recomendar aqueles
    // com notas mais altas
    HashMap<String, Double> recomendacoes = new HashMap<>();
    for (String filme : notasMedias.keySet()) {
      if (!filmesAssistidos.containsKey(filme) && notasMedias.get(filme) > 4.0) {
        recomendacoes.put(filme, notasMedias.get(filme));
      }
    }

    return recomendacoes;
  }
}
