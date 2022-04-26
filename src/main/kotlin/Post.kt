fun main() {

}

data class Post (
    val id: Int,
    val owner_id: Int,
    val from_id: Int,
    val created_by: Int,
    val date: Int,
    val text: String,
    val reply_owner_id: Int,
    val reply_post_id: Int,
    val friends_only: Int,
    val comments: Comments,
    val copyright: Copyright,
    val likes: Likes,
    val reposts: Reposts,
    val views: Views,
    val post_type: String,
    val signer_id: Int,
    val can_pin: Int,
    val can_delete: Int,
    val can_edit: Int,
    val is_pinned: Boolean,
    val marked_as_ads: Boolean,
    val is_favorite: Boolean,
    val donut: Donut,
    val postponed_id: Int
    ) {

}

data class Donut(
    val is_donut: Boolean,
    val paid_duration: Int,
    val placeholder: Boolean,
    val can_publish_free_copy: Boolean,
    val edit_mode: String = arrayOf("all", "duration").toString()
) {

}

data class Views(
    val count: Int
) {

}

data class Reposts(
    val count: Int,
    val user_reposted: Boolean
) {

}

data class Likes(
    val count: Int,
    val user_likes: Boolean,
    val can_like: Boolean,
    val can_publish: Boolean,
) {

}

data class Copyright(
    val id: Int,
    val link: String,
    val name: String,
    val type: String,
)

data class Comments(
    val count: Int,
    val can_post: Boolean,
    val groups_can_post: Boolean,
    val can_close: Boolean,
    val can_open: Boolean,
) {

}