package com.ggomjae.gom.modulebasicutils.custommapkey;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode
@NoArgsConstructor
public class CustomMapKey {

    private String firstColumn;
    private String secondColumn;
    private String thirdColumn;

    @Builder
    public CustomMapKey(String firstColumn,
                        String secondColumn,
                        String thirdColumn){
        this.firstColumn = firstColumn;
        this.secondColumn = secondColumn;
        this.thirdColumn = thirdColumn;
    }

    @Override
    public String toString(){
        return firstColumn + secondColumn + thirdColumn;
    }
}
