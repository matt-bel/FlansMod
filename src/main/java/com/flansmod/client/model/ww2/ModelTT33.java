package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelTT33 extends ModelGun 
{
	int textureX = 512;
	int textureY = 512;

	public ModelTT33() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[15];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 11
		gunModel[7] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 16
		gunModel[8] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 17
		gunModel[9] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 28
		gunModel[10] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 4
		gunModel[11] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 51
		gunModel[12] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 36
		gunModel[13] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 46
		gunModel[14] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 48

		gunModel[0].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(0F, -4.75F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F); // Box 1
		gunModel[1].setRotationPoint(3F, -4.75F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Box 2
		gunModel[2].setRotationPoint(3F, -4.75F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 3
		gunModel[3].setRotationPoint(2F, -3.75F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.625F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, -0.625F, -0.2F, -0.25F, -0.625F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, -0.625F, 0.125F, -0.25F); // Box 4
		gunModel[4].setRotationPoint(4F, -4.75F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[5].setRotationPoint(3F, -5.75F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 11
		gunModel[6].setRotationPoint(3F, -6F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 16
		gunModel[7].setRotationPoint(5F, -6.15F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, -0.25F, -0.8F, 0F, -0.25F, -0.8F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.375F, -0.8F, -0.25F, -1F, -0.8F, -0.25F, -1F, -0.8F, -0.25F, 0.375F, -0.8F, -0.25F); // Box 17
		gunModel[8].setRotationPoint(5F, -4.75F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -1F, 0F, -0.25F, -0.5F, -0.375F, -0.25F, -0.5F, -0.375F, -0.25F, -1F, 0F, -0.25F, -0.75F, -0.625F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.625F, -0.25F); // Box 28
		gunModel[9].setRotationPoint(-1F, -6F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 4
		gunModel[10].setRotationPoint(0F, -5.5F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 51
		gunModel[11].setRotationPoint(0F, -5.5F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -1.25F, 0F, 0F, -0.125F, 0F, 0F, -0.25F, -0.5F, -0.75F, -1.125F, -0.5F, -0.75F, -0.25F, -0.25F, 0F, -1.125F, -0.25F, 0F, -1.125F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Box 36
		gunModel[12].setRotationPoint(0F, -4.75F, 0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F); // Box 46
		gunModel[13].setRotationPoint(1F, -5.75F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -1.125F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.125F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, -0.25F, -0.75F, -1.125F, -0.25F, -0.75F, -1.125F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 48
		gunModel[14].setRotationPoint(0F, -4.75F, -1.5F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 40

		ammoModel[0].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -1.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -1.125F, 0F, -0.125F, -0.125F, -0.05F, -0.125F, -1.25F, -0.05F, -0.125F, -1.25F, -0.05F, -0.125F, -0.125F, -0.05F, -0.125F); // Box 40
		ammoModel[0].setRotationPoint(0F, -4.75F, -0.5F);


		slideModel = new ModelRendererTurbo[19];
		slideModel[0] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 8
		slideModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 10
		slideModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 12
		slideModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 13
		slideModel[4] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 15
		slideModel[5] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 30
		slideModel[6] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 37
		slideModel[7] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 38
		slideModel[8] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 39
		slideModel[9] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 40
		slideModel[10] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 41
		slideModel[11] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 42
		slideModel[12] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 12
		slideModel[13] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 18
		slideModel[14] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 50
		slideModel[15] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 38
		slideModel[16] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 53
		slideModel[17] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 54
		slideModel[18] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 55

		slideModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 8
		slideModel[0].setRotationPoint(5F, -6F, -0.5F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		slideModel[1].setRotationPoint(1F, -6F, -0.5F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		slideModel[2].setRotationPoint(3F, -6F, -0.5F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		slideModel[3].setRotationPoint(5F, -7F, -0.5F);

		slideModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.8F, 0F, -0.375F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 15
		slideModel[4].setRotationPoint(3F, -6F, -0.5F);

		slideModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.6F, -0.4F, -0.1F, -0.6F, -0.4F, -0.1F, -0.6F, -0.4F, -0.5F, -0.6F, -0.4F, -0.5F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F); // Box 30
		slideModel[5].setRotationPoint(8F, -7F, -0.5F);

		slideModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.875F, -0.5F, 0F, -0.875F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.875F, -0.5F, 0F, -0.875F); // Box 37
		slideModel[6].setRotationPoint(7F, -6F, -0.5F);

		slideModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.875F, 0F, -0.375F, -0.875F); // Box 38
		slideModel[7].setRotationPoint(8F, -6F, -0.5F);

		slideModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F); // Box 39
		slideModel[8].setRotationPoint(7F, -6F, -0.5F);

		slideModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, -0.875F, 0F, -0.375F, -0.875F, 0F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 40
		slideModel[9].setRotationPoint(8F, -6F, -0.5F);

		slideModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.875F, 0F, -0.375F, -0.875F, 0F, -0.375F, 0F, -0.5F, 0F, 0F); // Box 41
		slideModel[10].setRotationPoint(7F, -6F, -0.5F);

		slideModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, -0.8F, -0.25F, 0F, -0.8F, -0.25F, 0F, -0.8F, -0.25F, -0.5F, -0.8F, -0.25F); // Box 42
		slideModel[11].setRotationPoint(6F, -5F, -0.5F);

		slideModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, -0.125F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 12
		slideModel[12].setRotationPoint(0F, -6F, -0.5F);

		slideModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -1F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, -1F, -0.8F, -0.2F, -0.375F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0.125F, 0F); // Box 18
		slideModel[13].setRotationPoint(0F, -7F, -0.5F);

		slideModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		slideModel[14].setRotationPoint(0F, -6F, -0.5F);

		slideModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		slideModel[15].setRotationPoint(1F, -7F, -0.5F);

		slideModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.9F, -0.4F, -0.875F, -0.9F, -0.4F, -0.875F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, 0F, -0.4F, -0.875F, 0F, -0.4F, -0.875F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 53
		slideModel[16].setRotationPoint(2F, -7.15F, -0.5F);

		slideModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, -0.25F, -0.875F, -0.75F, -0.25F, -0.875F, -0.75F, -0.6F, 0F, -0.75F, -0.6F, 0F, 0F, -0.15F, -0.875F, 0F, -0.15F, -0.875F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 54
		slideModel[17].setRotationPoint(2F, -7.15F, -0.5F);

		slideModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.75F, -0.6F, -0.875F, -0.75F, -0.6F, -0.875F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.6F, -0.875F, 0F, -0.6F, -0.875F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 55
		slideModel[18].setRotationPoint(2F, -7.15F, -0.5F);



		animationType = EnumAnimationType.PISTOL_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}