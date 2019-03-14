package com.mrmrmr7.mytunes.controller.command;

public enum  CommandDirector {
    COMMAND ("command"),
    LOGIN ("login"),
    PASSWORD ("password"),
    SIGN_UP ("signup"),
    SIGN_IN ("signin"),
    FINISH_REGISTRATION ("finishRegistration"),
    LOG_OUT ("logout"),
    MOVE_INSIDE_WEB_INF ("move"),
    MOVE_TO_ACCOUNT ("account"),
    SECRET_ACCOUNT ("secretAccount"),

    //BUY OPERATIONS
    BUY_COMPOSITION ("buyComposition"),
    BUY_ALBUM ("buyAlbum"),
    BUY_MUSIC_SELECTION ("buyMusicSelection"),

    //VIEW OPERATIONS
    VIEW_CURRENT_BALANCE ("currentBalance"),
    VIEW_COMPOSITION_SHOP ("compositionShop"),
    VIEW_ALBUM_SHOP ("albumShop"),
    VIEW_MUSIC_SELECTION_SHOP ("musicSelectionShop"),

    //CRUD OPERATIONS
    ALBUM_DELETE ("albumDelete"),
    ALBUM_INSERT ("albumInsert"),
    ALBUM_GET_BY_ID ("albumGetById"),
    ALBUM_GET_ALL ("albumGetAll"),
    ALBUM_FEEDBACK_DELETE ("albumFeedbackDelete"),
    ALBUM_FEEDBACK_INSERT ("albumFeedbackInsert"),
    ALBUM_FEEDBACK_GET_BY_ID ("albumFeedbackGetById"),
    ALBUM_FEEDBACK_GET_ALL ("albumFeedbackGetAll"),
    AUTHOR_DELETE ("authorDelete"),
    AUTHOR_INSERT ("authorInsert"),
    AUTHOR_GET_BY_ID ("authorGetById"),
    AUTHOR_GET_ALL ("authorGetAll"),
    BONUS_DELETE ("bonusDelete"),
    BONUS_INSERT ("bonusInsert"),
    BONUS_GET_BY_ID ("bonusGetById"),
    BONUS_GET_ALL ("bonusGetAll"),
    COMPOSITION_DELETE ("compositionDelete"),
    COMPOSITION_INSERT ("compositionInsert"),
    COMPOSITION_GET_BY_ID ("compositionGetById"),
    COMPOSITION_GET_ALL ("compositionGetAll"),
    COMPOSITION_FEEDBACK_DELETE ("compositionFeedbackDelete"),
    COMPOSITION_FEEDBACK_INSERT ("compositionFeedbackInsert"),
    COMPOSITION_FEEDBACK_GET_BY_ID ("compositionFeedbackGetById"),
    COMPOSITION_FEEDBACK_GET_ALL ("compositionFeedbackGetAll"),
    GENRE_DELETE ("genreDelete"),
    GENRE_INSERT ("genreInsert"),
    GENRE_GET_BY_ID ("genreGetById"),
    GENRE_GET_ALL ("genreGetAll"),
    MUSIC_SELECTION_DELETE ("musicSelectionDelete"),
    MUSIC_SELECTION_INSERT ("musicSelectionInsert"),
    MUSIC_SELECTION_GET_BY_ID ("musicSelectionGetById"),
    MUSIC_SELECTION_GET_ALL ("musicSelectionGetAll"),
    MUSIC_SELECTION_FEEDBACK_DELETE ("musicSelectionFeedbackDelete"),
    MUSIC_SELECTION_FEEDBACK_INSERT ("musicSelectionFeedbackInsert"),
    MUSIC_SELECTION_FEEDBACK_GET_BY_ID ("musicSelectionFeedbackGetById"),
    MUSIC_SELECTION_FEEDBACK_GET_ALL ("musicSelectionFeedbackGetAll"),
    ROLE_DELETE ("roleDelete"),
    ROLE_INSERT ("roleInsert"),
    ROLE_GET_BY_ID ("roleGetById"),
    ROLE_GET_ALL ("roleGetAll"),
    STATUS_DELETE ("statusDelete"),
    STATUS_INSERT ("statusInsert"),
    STATUS_GET_BY_ID ("statusGetById"),
    STATUS_GET_ALL ("statusGetAll"),
    USER_ALBUM_DELETE ("userAlbumDelete"),
    USER_ALBUM_INSERT ("userAlbumInsert"),
    USER_ALBUM_GET_BY_ID ("userAlbumGetById"),
    USER_ALBUM_GET_ALL ("userAlbumGetAll"),
    USER_BONUS_DELETE ("userBonusDelete"),
    USER_BONUS_INSERT ("userBonusInsert"),
    USER_BONUS_GET_BY_ID ("userBonusGetById"),
    USER_BONUS_GET_ALL ("userBonusGetAll"),
    USER_COMPOSITION_DELETE ("userCompositionDelete"),
    USER_COMPOSITION_INSERT ("userCompositionInsert"),
    USER_COMPOSITION_GET_BY_ID ("userCompositionGetById"),
    USER_COMPOSITION_GET_ALL ("userCompositionGetAll"),
    USER_DELETE ("userDelete"),
    USER_INSERT ("userInsert"),
    USER_GET_BY_ID ("userGetById"),
    USER_GET_ALL ("userGetAll"),
    USER_MUSIC_SELECTION_DELETE ("userMusicSelectionDelete"),
    USER_MUSIC_SELECTION_INSERT ("userMusicSelectionInsert"),
    USER_MUSIC_SELECTION_GET_BY_ID ("userMusicSelectionGetById"),
    USER_MUSIC_SELECTION_GET_ALL ("sessionDataGetAll"),
    SESSION_DATA_DELETE ("sessionDataDelete"),
    SESSION_DATA_INSERT ("sessionDataInsert"),
    SESSION_DATA_GET_BY_ID ("sessionDataGetById"),
    SESSION_DATA_GET_ALL ("albumGetAll");

    private String value;

    CommandDirector(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}