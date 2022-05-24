package com.kslv.shoppinglist.domain

class GetShopItemUseCase (private val shopListRepository : ShopListRepository) {
    fun getShopItem(shopItem: ShopItem) {
        shopListRepository.getShopItem(shopItem)

    }
}