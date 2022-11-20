package homework2.task5_Additional;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Є об'єкти постів:
//        Є об'єкти коментарів до цих постів
//        Запакувати всі пости в список,всі коментарі в свій окремий список

        List<Posts> posts = Arrays.asList(
                new Posts(1, 1, "sunt aut facere repellat", "quia et suscipitnsuscip"),
                new Posts(1, 2, "qui est esse", "est rerum tempore"),
                new Posts(1, 3, "ea molestias quasi", "et iusto sed quo")
        );
        List<Comments> comments = Arrays.asList(
                new Comments(1,1, "id labore ex et quam laborum", "Eliseo@gardner.biz", "laudantium enim quasi"),
                new Comments(1,2, "quo vero reiciendis velit sl", "Jayne_Kuhic@sydney.com", "est natus enim nihil est"),
                new Comments(1,3, "odio adipisci rerum aut animi", "Nikita@garfield.biz", "quia molestiae reprehenderit quasi "),
                new Comments(2,7, "repellat consequatur praesentium vel", "Dallas@ole.me", "maiores sed dolores similique"),
                new Comments(2,8, "et omnis dolorem", "Mallory_Kunze@marie.org", "ut voluptatem corrupti veli"),
                new Comments(3,13, "aut inventore non pariatur sit vitae", "Kariane@jadyn.tv", "fuga eos qui dolor rerum"),
                new Comments(3,14, "et officiis id praesentium hic aut ipsa", "Nathan@solon.io", "vel quae voluptas qui exer"),
                new Comments(3,15, "debitis magnam hic odit ", "Maynard.Hodkiewicz@roberta.com", "nihil ut voluptates blanditiis autem")
        );

//        Проітерувати списки, і додати коментар з відповідним ід до відповідного поста
//        В постах додатково потрібно додати поле яке характеризує список комментарів.

        for (int i =0; i<posts.size();i++){
            for (int j =0; j<comments.size();j++) {
                if (posts.get(i).getId()==comments.get(j).getPostId()){
                  posts.get(i).getComments().add(comments.get(j));

                }
            }
        }

        for (int i =0; i<posts.size();i++){
            System.out.println(posts.get(i));
        }

    }
}
