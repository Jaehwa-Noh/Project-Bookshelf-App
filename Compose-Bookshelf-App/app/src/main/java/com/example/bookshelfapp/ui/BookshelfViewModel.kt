package com.example.bookshelfapp.ui

class BookshelfViewModel {
}


sealed interface BookShelfUiState {
    data class Success(val books: List<BooksUiModel>) : BookShelfUiState
    data object Loading : BookShelfUiState
    data class Error(val error: String) : BookShelfUiState
}

data class BooksUiModel(
    val id: String,
    val title: String,
    val url: String
)