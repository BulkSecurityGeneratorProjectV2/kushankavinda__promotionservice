package com.wdl.promotionservice.repository.Promotion;

import com.mongodb.MongoException;
import com.wdl.promotionservice.modal.Promotion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PromotionRepositoryImpl /*implements ImageRepositoryCustom*/ {

    @Autowired
    private MongoTemplate mongoTemplate;

   /* @Override
    public Promotion getSingleImage(String entityId, String imageType) {
        try {
            Query query = new Query();
            query.addCriteria(Criteria.where("entityID").is(entityId).and("imageType").is(imageType));
            return mongoTemplate.findOne(query, Image.class);
        } catch (MongoException ex) {
            ex.printStackTrace();
            return null;
        }
    }*/

  /*  @Override
    public List<Image> getImageList(List<ImageQuery> imageQueryList) {
        try {
            List<Image> resultList = new ArrayList<>();
            imageQueryList.forEach( (imageQuery -> {
                Query query = new Query();
                query.addCriteria(Criteria.where("entityID").is(imageQuery.getEntityId()).and("imageType").is(imageQuery.getImageType()));
                resultList.add(mongoTemplate.findOne(query, Image.class));
            }));
            return resultList;
        } catch (MongoException ex) {
            ex.printStackTrace();
            return null;
        }
    }*/
}
