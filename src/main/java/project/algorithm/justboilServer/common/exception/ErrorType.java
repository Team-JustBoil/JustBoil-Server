package project.algorithm.justboilServer.common.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum ErrorType {

    /**
     * 404 NOT FOUND
     */


    /**
     * 500 INTERNAL SERVER ERROR
     */
    EMPTY_PLAYLIST_LIST_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "플레이리스트 id 리스트가 비어있습니다."),
    EMPTY_VIDEOITEM_LIST_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "VideoItem 리스트가 비어있습니다."),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "알 수 없는 서버 에러가 발생했습니다"),
    ;

    private final HttpStatus httpStatus;
    private final String message;

    public int getHttpStatusCode() {
        return httpStatus.value();
    }
}
