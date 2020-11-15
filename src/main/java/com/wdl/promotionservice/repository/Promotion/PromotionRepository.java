package com.wdl.promotionservice.repository.Promotion;

import com.wdl.promotionservice.repository.BaseRepository;
import com.wdl.promotionservice.modal.Promotion;

import java.util.List;

public interface PromotionRepository extends BaseRepository<Promotion, String>, PromotionRepositoryCustom {
    Promotion findAllByName(String name);
    Promotion findAllByPromotionId(String promoId);
    //List<Promotion> findAl
}
