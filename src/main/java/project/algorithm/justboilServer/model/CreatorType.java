package project.algorithm.justboilServer.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum CreatorType {

    TYPE1(1, Arrays.asList("UCyn-K7rZLXjGl7VXGweIlcA"));

//    "UCTx3aCntDvkq-hGtOjKVSnQ", "UCy2WX3w5UyYFHBDHyWFKNUQ", "UC0htUSwcxfSGNfK_5Q28JkA"

    private final Integer typeNumber;
    private final List<String> creatorIdList;

    public static List<String> findCreatorIdListByTypeNumber(Integer typeNumber) {
        for (CreatorType creatorType : values()) {
            if (creatorType.getTypeNumber().equals(typeNumber)) {
                return creatorType.getCreatorIdList();
            }
        }
        return Collections.emptyList();
    }
}
