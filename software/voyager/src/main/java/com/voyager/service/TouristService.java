package com.voyager.service;
import com.voyager.model.Tourist;

import java.util.List;

public interface TouristService {
    public List<Tourist> getAllTourists();
    public void addTourist(Tourist tourist);
    public Tourist getTourist(Integer touristId);
    public void deleteTourist(Integer touristId);
    public Tourist updateTourist(Tourist tourist);
}
