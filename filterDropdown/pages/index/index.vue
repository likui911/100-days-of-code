<template>
	<view>
		<filterDropdown :menuTop="0" :filterData="filterData" :updateMenuName="true" @confirm="confirm" dataFormat="Object"></filterDropdown>
		<!-- 占位 -->
		<view class="place"></view>
	</view>
</template>

<script>
	import filterDropdown from '@/components/filter-dropdown/filter-dropdown.vue';
	import data from '@/common/data.js';
	export default {
		components: {
			filterDropdown
		},
		data() {
			return {
				indexArr:'',
				valueArr:'',
				filterData:[]
			};
		}, 
		onLoad: function () {
			setTimeout(()=>{
				this.filterData = data; 
			},100);
		},
		methods:{
			confirm(e){
				this.indexArr = e.index;
				this.valueArr = e.value;
				console.log(this.indexArr,this.valueArr);
			},
		}
	}
</script>
<style lang="scss">
.datajson{
	z-index: 2;
	position: fixed;
	left: 0;
	right: 0;
	bottom: 0;
	height: 250px;
	padding: 0 10px;
	background-color: rgba(255,255,255,.8);
	backdrop-filter: blur(15px);
	-webkit-backdrop-filter: blur(15px);
	font-size: 12px;
	.text{
		margin-top: 10px;
	}
	.item{
		width: 15px;
	}
}
.place{
		background-color: #ffffff;
		height: 44px;
	}
	.swiper {
		width: 100%;
		margin-top: 10upx;
		display: flex;
		justify-content: center;
		.swiper-box {
			width: 92%;
			height: 230rpx;
	
			overflow: hidden;
			border-radius: 15rpx;
			box-shadow: 0upx 8upx 25rpx rgba(0, 0, 0, 0.2);
			//兼容ios，微信小程序
			position: relative;
			z-index: 1;
			swiper {
				width: 100%;
				height: 230rpx;
				swiper-item {
					image {
						width: 100%;
						height: 230rpx;
					}
				}
			}
			.indicator {
				position: absolute;
				bottom: 20upx;
				left: 20upx;
				background-color: rgba(255, 255, 255, 0.4);
				width: 150upx;
				height: 5upx;
				border-radius: 3upx;
				overflow: hidden;
				display: flex;
				.dots {
					width: 0upx;
					background-color: rgba(255, 255, 255, 1);
					transition: all 0.3s ease-out;
					&.on {
						width: (100%/3);
					}
				}
			}
		}
	}
.goods-list{
	padding-top: 10px;
		.loading-text{
			width: 100%;
			display: flex;
			justify-content: center;
			align-items: center;
			height: 30px;
			color: #979797;
			font-size: 12px;
		}
		.product-list{
			width: 92%;
			padding: 0 4% 3vw 4%; 
			display: flex;
			justify-content: space-between;
			flex-wrap: wrap;
			.product{
				width: 48%;
				border-radius: 10px;
				background-color: #fff;
				margin: 0 0 7px 0;
				box-shadow: 0 3px 12px rgba(0,0,0,0.1);
				image{
					width: 100%;
					border-radius: 10px 10px 0 0;
				}
				.name{
					width: 92%;
					padding: 5px 4%;
					display: -webkit-box;
					-webkit-box-orient: vertical;
					-webkit-line-clamp: 2;
					text-align: justify;
					overflow: hidden;
					font-size: 15px;
				}
				.info{
					display: flex;
					justify-content: space-between;
					align-items: flex-end;
					width: 92%;
					padding: 5px 4% 5px 4%;
					.price{
						color: #e65339;
						font-size: 15px;
						font-weight: 600;
					}
					.slogan{
						color: #807c87;
						font-size: 12px;
					}
				}
			}
			
		}
	}
</style>
