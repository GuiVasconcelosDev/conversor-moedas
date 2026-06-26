package br.com.guilhermedev.conversor.model;

import com.google.gson.annotations.SerializedName;

public record Moeda(
        @SerializedName("base_code") String baseCode,
        @SerializedName("target_code") String targetCode,
        @SerializedName("conversion_rate") double conversionRate
) {

}
