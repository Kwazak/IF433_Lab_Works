package oop_joshua_ivander_hartawan.week10

data class ApiResponse<T>(
    val status: String,
    val data: T,
)