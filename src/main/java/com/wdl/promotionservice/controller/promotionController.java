package com.wdl.promotionservice.controller;

import com.wdl.promotionservice.modal.Promotion;
import com.wdl.promotionservice.service.promotionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.wdl.promotionservice.viewmodal.promotionViewModal;

import java.util.List;

@Api(tags = "Promotion Service")
@RestController
@RequestMapping("/api/promotion")
public class promotionController {

    @Autowired
    private promotionService promoService;

    @ApiOperation(value = "Add Promotion")
    @RequestMapping(value = "/create-promotion", method = RequestMethod.POST)
    public ResponseEntity<?> createPromotion(@RequestBody promotionViewModal promo) {
        
        return new ResponseEntity<>(promoService.createPromotion(promo), HttpStatus.CREATED);
    }

    @ApiOperation(value="Get Promotion Accoriding Name")
    @RequestMapping(value="/get-promotionByName/{name}", method= RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public promotionViewModal getPromitionByName(@PathVariable String name){
        return promoService.getPromotionAccordingName(name);
    }

    @ApiOperation(value="Get Promotion Accoriding Id")
    @RequestMapping(value="/get-promotionById/{promoId}", method= RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public promotionViewModal getPromotionById(@PathVariable String promoId){
        return promoService.getPromotionAccordingId(promoId);
    }

    @ApiOperation(value = "Get All Promotions")
    @RequestMapping(value = "/getAllPromotins", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Promotion> getAllPromotions() {
        return promoService.getAllPromotions();
    }

    @ApiOperation(value = "Delete All Promotions")
    @RequestMapping(value = "/deleteAllPromotins", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> deleteAllPromotions() {
        return new ResponseEntity<>(promoService.deleteAllPromotions(), HttpStatus.OK);
    }

}
