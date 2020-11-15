package com.wdl.promotionservice.service;

import com.mongodb.MongoException;
import com.wdl.promotionservice.mappers.PromotionMapper;
import com.wdl.promotionservice.modal.Promotion;
import com.wdl.promotionservice.repository.Promotion.PromotionRepository;
import com.wdl.promotionservice.viewmodal.promotionViewModal;
import com.wdl.promotionservice.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class promotionService {
    @Autowired
    private PromotionMapper promotionMapper;
    @Autowired
    private PromotionRepository promoRepo;
    public String createPromotion(promotionViewModal promo) {
        Promotion promotion = new Promotion ();
        promotion = promotionMapper.ViewModelToEntityModel(promo);
        try {
            promoRepo.insert(promotion);
            return Constants.CREATED; 
        } catch (MongoException ex) {
            ex.printStackTrace();
            return Constants.MONGO_EXCEPTION;
        }
    }
    public promotionViewModal getPromotionAccordingName(String name) {
        Promotion promotion = new Promotion ();
        promotion = promoRepo.findAllByName(name);
        promotionViewModal promoView = new promotionViewModal ();
        promoView = promotionMapper.EntityModelToViewModel(promotion);
        return promoView;
    }
    public promotionViewModal getPromotionAccordingId(String promoId) {
        Promotion promotion = new Promotion ();
        promotion = promoRepo.findAllByPromotionId(promoId);
        promotionViewModal promoView = new promotionViewModal ();
        promoView = promotionMapper.EntityModelToViewModel(promotion);
        return promoView;
    }
    public List<Promotion> getAllPromotions () {
        List<Promotion> promo = promoRepo.findAll();
        return  promo;
    }
    public String deleteAllPromotions () {
        promoRepo.deleteAll();
        return Constants.DELETED;
    }
}