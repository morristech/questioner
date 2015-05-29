package com.shervin.questioner.provider;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shervin.questioner.model.Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class QuestionProvider {

    public static Gson gson = new GsonBuilder().create();

    public static List<Question> getQuiz() {
        List<Question> questions = new ArrayList<>();
        JsonElement element = gson.fromJson(QUESTIONS, JsonElement.class);
        JsonObject jsonObj = element.getAsJsonObject();

        for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
            questions.add(new Question(entry, jsonObj.getAsJsonArray(entry.getKey())));
        }

        return questions;
    }

    //region Question json
    private static final String QUESTIONS = "{ \n" +
            "  \"365 Organic Frosted Flakes Cereal\": [ \n" +
            "    \"https://d2lnr5mha7bycj.cloudfront.net/itemimage/image/12215-eaac44d114cb00be4e3ecc26e0cf39be.jpg\",\n" +
            "    \"https://d2lnr5mha7bycj.cloudfront.net/itemimage/image/12217-9186e76a368e196da3bc4b655d02ca30.jpg\",\n" +
            "    \"https://d2lnr5mha7bycj.cloudfront.net/itemimage/image/12212-0e2a15ef92d3a7b48ef53c4162b3c836.jpg\",\n" +
            "    \"https://d2lnr5mha7bycj.cloudfront.net/itemimage/image/12189-97c5e14e27d6344a34a9c9d903e0dc5a.jpg\" \n" +
            "  ],\n" +
            "  \"Lucerne Reduced Fat Milk (64 oz)\": [\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/136010569_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/136050016_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/136010271_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/136010126_200x200.jpg\"\n" +
            "  ],\n" +
            "  \"Cottonelle Clean Care Bathroom Tissue (4 roll)\": [\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/960054668_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/960042926_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/960048515_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/960054666_200x200.jpg\"\n" +
            "  ],\n" +
            "  \"Sun-Dried Tomato Chicken Sausage\": [\n" +
            "    \"https://d2lnr5mha7bycj.cloudfront.net/itemimage/image/1238-52fbe159a8d96ee9774a7bd881387589.jpg\",\n" +
            "    \"https://d2lnr5mha7bycj.cloudfront.net/itemimage/image/1240-48082d377a3fd20a8cdaf84ced5a931e.jpg\",\n" +
            "    \"https://d2lnr5mha7bycj.cloudfront.net/itemimage/image/1253-725a43f116c2afde701230530a22562a.jpg\",\n" +
            "    \"https://d2lnr5mha7bycj.cloudfront.net/itemimage/image/1263-8603ed8c9db95955b57c0d2a7c63f477.jpg\"\n" +
            "  ],\n" +
            "  \"365 Organic Thai Jasmine Rice\": [\n" +
            "    \"https://d2lnr5mha7bycj.cloudfront.net/itemimage/image/12111-89802d942e539321aea13671766e3c96.jpg\",\n" +
            "    \"https://d2lnr5mha7bycj.cloudfront.net/itemimage/image/12172-4b0201a183fb047f2e46165c749d12ff.jpg\",\n" +
            "    \"https://d2lnr5mha7bycj.cloudfront.net/itemimage/image/11690-285bb67aeb63c9837ada1a04d149508c.png\",\n" +
            "    \"https://d2lnr5mha7bycj.cloudfront.net/itemimage/image/12185-4f64cab198d5289e02d8d7a4e095afaa.jpg\"\n" +
            "  ],\n" +
            "  \"Chobani Greek Pineapple Yogurt\": [\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/960049985_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/960038585_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/960055225_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/960038584_200x200.jpg\"\n" +
            "  ],\n" +
            "  \"Organic Garbanzo Beans\": [\n" +
            "    \"https://d2lnr5mha7bycj.cloudfront.net/itemimage/image/4654-aa6e38c59150b93266e6e7d92eb458da.jpg\",\n" +
            "    \"https://d2lnr5mha7bycj.cloudfront.net/itemimage/image/4664-d293cdea115fdd4edd613eb63c5ebd5a.jpg\",\n" +
            "    \"https://d2lnr5mha7bycj.cloudfront.net/itemimage/image/4666-45c988d4a235c8ce335671557cc8ddb8.jpg\",\n" +
            "    \"https://d2lnr5mha7bycj.cloudfront.net/itemimage/image/4668-af86db1d795e2c725d58d13a27c241d1.jpg\"\n" +
            "  ],\n" +
            "  \"Nature Valley Sweet and Salty Nut Almond\": [\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/111200483_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/111200546_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/111100204_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/111100114_200x200.jpg\"\n" +
            "  ],\n" +
            "  \"Pepto Bismol Chewable Tablets\": [\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/159150033_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/159150025_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/159150028_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/159250049_200x200.jpg\"\n" +
            "  ],\n" +
            "  \"Lemon\": [\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/184080250_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/184080409_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/184450054_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/184020066_200x200.jpg\"\n" +
            "  ],\n" +
            "  \"Folgers Coffee Half Caffeine Medium\": [\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/960017511_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/119010239_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/960017296_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/960017628_200x200.jpg\"\n" +
            "  ],\n" +
            "  \"Oroweat Multi-grain Bread\": [\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/196052628_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/196052221_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/196050884_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/196050896_200x200.jpg\"\n" +
            "  ],\n" +
            "  \"Sargento Shredded Sharp Cheddar\": [\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/960074698_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/960074844_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/237050287_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/237050845_200x200.jpg\"\n" +
            "  ],\n" +
            "  \"Lucerne Large Eggs Grade AA 18 count\": [\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/138350091_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/138350098_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/138350084_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/138350158_200x200.jpg\"\n" +
            "  ],\n" +
            "  \"Trader Joe's Gluten Free Ginger Snaps\": [\n" +
            "    \"https://d2lnr5mha7bycj.cloudfront.net/itemimage/image/5238-e8e8b4d2043f78192271b523a54ad0d6.jpg\",\n" +
            "    \"https://d2lnr5mha7bycj.cloudfront.net/itemimage/image/3087-55a1606fe784ac985c820bf84c1639ba.jpg\",\n" +
            "    \"https://d2lnr5mha7bycj.cloudfront.net/itemimage/image/2804-3bdcbd5fbf3f1aa85ef52c0149ce7c1a.jpg\",\n" +
            "    \"https://d2lnr5mha7bycj.cloudfront.net/itemimage/image/3142-a27e00a0d94985037996f165781203ea.jpg\"\n" +
            "  ],\n" +
            "  \"Safeway Farms Sliced White Mushroom\": [\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/960073826_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/184430085_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/960073834_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/184430100_200x200.jpg\"\n" +
            "  ],\n" +
            "  \"Arrowhead Mountain Spring Water 6-pack\": [\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/108200051_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/108200391_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/108200762_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/108200052_200x200.jpg\"\n" +
            "  ],\n" +
            "  \"Granny Smith Apple\": [\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/184020063_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/184020050_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/184020045_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/184020051_200x200.jpg\"\n" +
            "  ],\n" +
            "  \"Simply Organic Black Pepper\": [\n" +
            "    \"https://d2lnr5mha7bycj.cloudfront.net/itemimage/image/7320-7fa1cb652f0534dd7f6a73c72e058668.jpg\",\n" +
            "    \"https://d2lnr5mha7bycj.cloudfront.net/itemimage/image/12123-938057a7d5464ebbd1ddd0b5e684369c.jpg\",\n" +
            "    \"https://d2lnr5mha7bycj.cloudfront.net/itemimage/image/7322-50370d7bca17bc7da16ae3483171f76e.jpg\",\n" +
            "    \"https://d2lnr5mha7bycj.cloudfront.net/itemimage/image/7325-866db987cab0edcf2f3c3580c04520a9.jpg\"\n" +
            "  ],\n" +
            "  \"White Corn Tortilla Chips\": [\n" +
            "    \"https://d2lnr5mha7bycj.cloudfront.net/itemimage/image/4380-ad56a1f7582f483ab0a4a0a900508f8d.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/147010090_200x200.jpg\",\n" +
            "    \"https://d2lnr5mha7bycj.cloudfront.net/itemimage/image/2347-96042f15d12d8217d7e2ea51f918b28a.jpg\",\n" +
            "    \"https://d2lnr5mha7bycj.cloudfront.net/itemimage/image/4378-8639791db42c381bf9540b584825e092.jpg\"\n" +
            "  ],\n" +
            "  \"Foster Farms Chicken Breast Fillets\": [\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/188300248_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/188330021_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/188300076_200x200.jpg\",\n" +
            "    \"https://d1dei6v1vlghw9.cloudfront.net/productimages/200x200/288300239_200x200.jpg\"\n" +
            "  ]\n" +
            "}";
    //endregion
}