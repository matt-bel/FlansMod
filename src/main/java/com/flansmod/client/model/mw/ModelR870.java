package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelR870 extends ModelGun 
{
	int textureX = 512;
	int textureY = 64;

	public ModelR870() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[35];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box1
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Box2
		gunModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box5
		gunModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box6
		gunModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box12
		gunModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box14
		gunModel[6] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box15
		gunModel[7] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import Box16
		gunModel[8] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import Box17
		gunModel[9] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box18
		gunModel[10] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box19
		gunModel[11] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box20
		gunModel[12] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box21
		gunModel[13] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box24
		gunModel[14] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import Box25
		gunModel[15] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box28
		gunModel[16] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import Box29
		gunModel[17] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box31
		gunModel[18] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box32
		gunModel[19] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import Box41
		gunModel[20] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box52
		gunModel[21] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Box53
		gunModel[22] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Import Box54
		gunModel[23] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Import Box55
		gunModel[24] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box59
		gunModel[25] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box60
		gunModel[26] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box61
		gunModel[27] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box62
		gunModel[28] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box63
		gunModel[29] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box64
		gunModel[30] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 0
		gunModel[31] = new ModelRendererTurbo(this, 413, 23, textureX, textureY); // Box 54
		gunModel[32] = new ModelRendererTurbo(this, 1, 13, textureX, textureY); // Box 8
		gunModel[33] = new ModelRendererTurbo(this, 1, 13, textureX, textureY); // Box 9
		gunModel[34] = new ModelRendererTurbo(this, 81, 22, textureX, textureY); // Import ImportImportBox10

		gunModel[0].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Import Box1
		gunModel[0].setRotationPoint(2F, -4.5F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box2
		gunModel[1].setRotationPoint(0F, -5.5F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -1F, -0.8F, 0F, -0.2F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box5
		gunModel[2].setRotationPoint(0F, -5.5F, -1.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Import Box6
		gunModel[3].setRotationPoint(0F, -5.5F, 0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.75F, -0.25F); // Import Box12
		gunModel[4].setRotationPoint(2F, -3.5F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.65F, -0.5F, -0.25F, -0.65F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box14
		gunModel[5].setRotationPoint(0F, -2.5F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Import Box15
		gunModel[6].setRotationPoint(3F, -3.5F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box16
		gunModel[7].setRotationPoint(4F, -3.5F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Import Box17
		gunModel[8].setRotationPoint(4F, -3.5F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Import Box18
		gunModel[9].setRotationPoint(2F, -6.5F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box19
		gunModel[10].setRotationPoint(2F, -5.5F, -1.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Import Box20
		gunModel[11].setRotationPoint(2F, -5.5F, 0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box21
		gunModel[12].setRotationPoint(4F, -4.5F, -1.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.8F, 0.5F, -0.2F, -0.8F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box24
		gunModel[13].setRotationPoint(4F, -5.5F, -1.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box25
		gunModel[14].setRotationPoint(8F, -5.5F, -1.5F);

		gunModel[15].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box28
		gunModel[15].setRotationPoint(5F, -4.5F, -0.5F);

		gunModel[16].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box29
		gunModel[16].setRotationPoint(8F, -5.5F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, 0F, -0.1F, 0.1F); // Import Box31
		gunModel[17].setRotationPoint(9F, -5.5F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, 0F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Import Box32
		gunModel[18].setRotationPoint(9F, -4.5F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, -0.8F, -0.05F, -5F, -0.8F, -0.05F, -5F, -0.8F, -0.05F, 0F, -0.8F, -0.05F, 0F, 0F, -0.05F, -5F, 0F, -0.05F, -5F, 0F, -0.05F, 0F, 0F, -0.05F); // Import Box41
		gunModel[19].setRotationPoint(2.75F, -6.5F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.925F, 0F, -0.75F, -0.925F, 0F, -0.75F, -0.925F, 0F, 0F, -0.925F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Import Box52
		gunModel[20].setRotationPoint(6F, -4.5F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.925F, 0F, 0F, -0.925F, 0F, 0F, -0.925F, 0F, -0.75F, -0.925F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Import Box53
		gunModel[21].setRotationPoint(7F, -4.5F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.925F, 0F, -0.25F, -0.925F, 0F, -0.25F, -0.925F, -0.675F, -0.25F, -0.925F, -0.675F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.675F, -0.25F, 0F, -0.675F); // Import Box54
		gunModel[22].setRotationPoint(6F, -4.5F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.925F, -0.675F, -0.25F, -0.925F, -0.675F, -0.25F, -0.925F, 0F, -0.25F, -0.925F, 0F, -0.25F, 0F, -0.675F, -0.25F, 0F, -0.675F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box55
		gunModel[23].setRotationPoint(6F, -4.5F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 14, 6, 6, 0F, -0.1F, -0.1F, -0.1F, -12.1F, -0.1F, -0.1F, -12.1F, -0.1F, -5.1F, -0.1F, -0.1F, -5.1F, -0.1F, -5.1F, -0.1F, -12.1F, -5.1F, -0.1F, -12.1F, -5.1F, -5.1F, -0.1F, -5.1F, -5.1F); // Import Box59
		gunModel[24].setRotationPoint(2.5F, -3.5F, 0.6F);
		gunModel[24].rotateAngleZ = 1.57079633F;

		gunModel[25].addShapeBox(0F, 0F, 0F, 14, 6, 6, 0F, -0.1F, -0.1F, -0.1F, -12.1F, -0.1F, -0.1F, -12.1F, -0.1F, -5.1F, -0.1F, -0.1F, -5.1F, -0.1F, -5.1F, -0.1F, -12.1F, -5.1F, -0.1F, -12.1F, -5.1F, -5.1F, -0.1F, -5.1F, -5.1F); // Import Box60
		gunModel[25].setRotationPoint(3.5F, -3.5F, 0.6F);
		gunModel[25].rotateAngleZ = 1.57079633F;

		gunModel[26].addShapeBox(0F, 0F, 0F, 14, 6, 6, 0F, -0.1F, -0.1F, -0.1F, -12.1F, -0.1F, -0.1F, -12.1F, -0.1F, -5.1F, -0.1F, -0.1F, -5.1F, -0.1F, -5.1F, -0.1F, -12.1F, -5.1F, -0.1F, -12.1F, -5.1F, -5.1F, -0.1F, -5.1F, -5.1F); // Import Box61
		gunModel[26].setRotationPoint(4.5F, -3.5F, 0.6F);
		gunModel[26].rotateAngleZ = 1.57079633F;

		gunModel[27].addShapeBox(0F, 0F, 0F, 14, 6, 6, 0F, -0.1F, -0.1F, -0.1F, -12.1F, -0.1F, -0.1F, -12.1F, -0.1F, -5.1F, -0.1F, -0.1F, -5.1F, -0.1F, -5.1F, -0.1F, -12.1F, -5.1F, -0.1F, -12.1F, -5.1F, -5.1F, -0.1F, -5.1F, -5.1F); // Import Box62
		gunModel[27].setRotationPoint(5.5F, -3.5F, 0.6F);
		gunModel[27].rotateAngleZ = 1.57079633F;

		gunModel[28].addShapeBox(0F, 0F, 0F, 14, 6, 6, 0F, -0.1F, -0.1F, -0.1F, -12.1F, -0.1F, -0.1F, -12.1F, -0.1F, -5.1F, -0.1F, -0.1F, -5.1F, -0.1F, -5.1F, -0.1F, -12.1F, -5.1F, -0.1F, -12.1F, -5.1F, -5.1F, -0.1F, -5.1F, -5.1F); // Import Box63
		gunModel[28].setRotationPoint(6.5F, -3.5F, 0.6F);
		gunModel[28].rotateAngleZ = 1.57079633F;

		gunModel[29].addShapeBox(0F, 0F, 0F, 14, 6, 6, 0F, -0.1F, -0.1F, -0.1F, -12.1F, -0.1F, -0.1F, -12.1F, -0.1F, -5.1F, -0.1F, -0.1F, -5.1F, -0.1F, -5.1F, -0.1F, -12.1F, -5.1F, -0.1F, -12.1F, -5.1F, -5.1F, -0.1F, -5.1F, -5.1F); // Import Box64
		gunModel[29].setRotationPoint(7.5F, -3.5F, 0.6F);
		gunModel[29].rotateAngleZ = 1.57079633F;

		gunModel[30].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[30].setRotationPoint(-1F, -3.5F, -0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.125F, -0.25F, -0.125F, 0.125F, -0.25F, -0.125F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, -0.25F, -0.25F, -0.125F, -0.25F, -0.25F, -0.125F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 54
		gunModel[31].setRotationPoint(20F, -4.5F, -0.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 8
		gunModel[32].setRotationPoint(0F, -4.5F, -0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.125F, -0.125F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.125F, -0.125F); // Box 9
		gunModel[33].setRotationPoint(-1F, -4.5F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -0.05F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.05F, -0.125F, -0.125F, -0.05F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, -0.05F, -0.125F, -0.125F); // Import ImportImportBox10
		gunModel[34].setRotationPoint(-6F, -4.5F, -0.5F);


		defaultStockModel = new ModelRendererTurbo[15];
		defaultStockModel[0] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 64
		defaultStockModel[1] = new ModelRendererTurbo(this, 428, 32, textureX, textureY); // Box 65
		defaultStockModel[2] = new ModelRendererTurbo(this, 428, 15, textureX, textureY); // Box 66
		defaultStockModel[3] = new ModelRendererTurbo(this, 438, 14, textureX, textureY); // Box 67
		defaultStockModel[4] = new ModelRendererTurbo(this, 450, 23, textureX, textureY); // Box 68
		defaultStockModel[5] = new ModelRendererTurbo(this, 449, 30, textureX, textureY); // Box 69
		defaultStockModel[6] = new ModelRendererTurbo(this, 448, 17, textureX, textureY); // Box 70
		defaultStockModel[7] = new ModelRendererTurbo(this, 12, 23, textureX, textureY); // Box 71
		defaultStockModel[8] = new ModelRendererTurbo(this, 463, 17, textureX, textureY); // Box 72
		defaultStockModel[9] = new ModelRendererTurbo(this, 47, 38, textureX, textureY); // Box 73
		defaultStockModel[10] = new ModelRendererTurbo(this, 66, 42, textureX, textureY); // Box 74
		defaultStockModel[11] = new ModelRendererTurbo(this, 68, 34, textureX, textureY); // Box 75
		defaultStockModel[12] = new ModelRendererTurbo(this, 61, 31, textureX, textureY); // Box 76
		defaultStockModel[13] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 77
		defaultStockModel[14] = new ModelRendererTurbo(this, 68, 26, textureX, textureY); // Box 78

		defaultStockModel[0].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 64
		defaultStockModel[0].setRotationPoint(-7F, -4.5F, -0.5F);

		defaultStockModel[1].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 65
		defaultStockModel[1].setRotationPoint(-7F, -3.5F, -0.5F);

		defaultStockModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.25F, 0F); // Box 66
		defaultStockModel[2].setRotationPoint(-5F, -3.5F, -0.5F);

		defaultStockModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 67
		defaultStockModel[3].setRotationPoint(-4F, -3.5F, -0.5F);

		defaultStockModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 68
		defaultStockModel[4].setRotationPoint(-7F, -4.5F, -1.5F);

		defaultStockModel[5].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 69
		defaultStockModel[5].setRotationPoint(-7F, -3.75F, -1.5F);

		defaultStockModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 70
		defaultStockModel[6].setRotationPoint(-7F, -3.75F, 0.5F);

		defaultStockModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 71
		defaultStockModel[7].setRotationPoint(-7F, -4.5F, 0.5F);

		defaultStockModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 72
		defaultStockModel[8].setRotationPoint(-8F, -4.5F, -0.5F);

		defaultStockModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.8F, -0.25F, 0F); // Box 73
		defaultStockModel[9].setRotationPoint(-8F, -4.5F, -1.5F);

		defaultStockModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.8F, -0.25F, -0.75F); // Box 74
		defaultStockModel[10].setRotationPoint(-8F, -4.5F, 0.5F);

		defaultStockModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.8F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.8F, -0.25F, 0F, -0.8F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 75
		defaultStockModel[11].setRotationPoint(-8F, -3.5F, -1.5F);

		defaultStockModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.8F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.8F, -0.25F, -0.75F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.8F, 0F, -1F); // Box 76
		defaultStockModel[12].setRotationPoint(-8F, -3.5F, 0.5F);

		defaultStockModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.8F, -0.5F, 0F); // Box 77
		defaultStockModel[13].setRotationPoint(-8F, -3.75F, -1.5F);

		defaultStockModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.8F, 0F, -0.75F, -0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.8F, -0.5F, -0.75F); // Box 78
		defaultStockModel[14].setRotationPoint(-8F, -3.75F, 0.5F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box49

		ammoModel[0].addShapeBox(0F, 0F, 0F, 14, 6, 6, 0F, -0.1F, -0.1F, -0.1F, -12.1F, -0.1F, -0.1F, -12.1F, -0.1F, -5.1F, -0.1F, -0.1F, -5.1F, -0.1F, -5.1F, -0.1F, -12.1F, -5.1F, -0.1F, -12.1F, -5.1F, -5.1F, -0.1F, -5.1F, -5.1F); // Import Box49
		ammoModel[0].setRotationPoint(6F, -4.5F, -0.5F);


		pumpModel = new ModelRendererTurbo[6];
		pumpModel[0] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box22
		pumpModel[1] = new ModelRendererTurbo(this, 482, 28, textureX, textureY); // Box 34
		pumpModel[2] = new ModelRendererTurbo(this, 482, 32, textureX, textureY); // Box 35
		pumpModel[3] = new ModelRendererTurbo(this, 482, 36, textureX, textureY); // Box 37
		pumpModel[4] = new ModelRendererTurbo(this, 482, 25, textureX, textureY); // Box 38
		pumpModel[5] = new ModelRendererTurbo(this, 23, 16, textureX, textureY); // Box 55

		pumpModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box22
		pumpModel[0].setRotationPoint(5F, -5.5F, -0.5F);

		pumpModel[1].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		pumpModel[1].setRotationPoint(12F, -4.5F, -0.5F);

		pumpModel[2].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		pumpModel[2].setRotationPoint(12F, -4.5F, -1.5F);

		pumpModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 37
		pumpModel[3].setRotationPoint(12F, -3.5F, -0.5F);

		pumpModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 38
		pumpModel[4].setRotationPoint(12F, -4.5F, 0.5F);

		pumpModel[5].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, -0.05F, 0F, -0.05F, -5.05F, 0F, -0.05F, -5.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.8F, -0.05F, -5.05F, -0.8F, -0.05F, -5.05F, -0.8F, -0.05F, -0.05F, -0.8F, -0.05F); // Box 55
		pumpModel[5].setRotationPoint(12F, -3.25F, -0.5F);



		scopeAttachPoint = new Vector3f(3.5F /16F, 0F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(4 /16F, -0.5F /16F, 0F /16F);


		animationType = EnumAnimationType.SHOTGUN;

                                tiltGunTime = 0.150F;
                                unloadClipTime = 0.0F;
                                loadClipTime = 0.700F;
                                untiltGunTime = 0.150F;
       


		gripIsOnPump = true;


		numBulletsInReloadAnimation = 7F;


		pumpDelayAfterReload = 122;


		pumpDelay = 10;


		pumpTime = 5;


		pumpHandleDistance = 0.2F;


		barrelBreakPoint = new Vector3f(0 /16F, -6F /16F, 15F /16F);


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}