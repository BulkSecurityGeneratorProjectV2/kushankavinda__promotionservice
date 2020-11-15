package com.wdl.promotionservice.mappers;

import com.wdl.promotionservice.modal.Promotion;
import com.wdl.promotionservice.viewmodal.promotionViewModal;

import org.springframework.stereotype.Service;


@Service
public class PromotionMapper {
    public Promotion ViewModelToEntityModel(promotionViewModal promoViewModel){
        if (promoViewModel == null) {
            return null;
        }
        Promotion promo = new Promotion ();
        promo.setStartDate(promoViewModel.getStartDate());
        promo.setImageUrl(promoViewModel.getImageUrl());
        promo.setName(promoViewModel.getName());
        promo.setRate(promoViewModel.getRate());
        promo.setRateType(promoViewModel.getRateType());
        promo.setPromotionId(promoViewModel.getPromotionId());

        return promo;

    }
    public promotionViewModal EntityModelToViewModel(Promotion entity)
    {
        if (entity == null) { return null; }
        promotionViewModal promViewModel = new promotionViewModal();
        promViewModel.setDescription(entity.getDescription());
        promViewModel.setStartDate(entity.getStartDate());
        promViewModel.setImageUrl(entity.getImageUrl());
        promViewModel.setRate(entity.getRate());
        promViewModel.setPromotionId(entity.getPromotionId());

        return promViewModel;

    }

}
