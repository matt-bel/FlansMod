package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelM9 extends ModelGun 
{
	int textureX = 512;
	int textureY = 32;

	public ModelM9() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[15];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 12
		gunModel[6] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 26
		gunModel[7] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 27
		gunModel[8] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 28
		gunModel[9] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 29
		gunModel[10] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 30
		gunModel[11] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 31
		gunModel[12] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 32
		gunModel[13] = new ModelRendererTurbo(this, 272, 6, textureX, textureY); // Box 34
		gunModel[14] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 35

		gunModel[0].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(0F, -4.75F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[1].setRotationPoint(1F, -5.75F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -1F, -0.25F); // Box 2
		gunModel[2].setRotationPoint(3F, -4.75F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 3
		gunModel[3].setRotationPoint(2F, -3.75F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 4
		gunModel[4].setRotationPoint(4F, -4.75F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F, -0.875F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 12
		gunModel[5].setRotationPoint(4F, -6.4F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, -0.4F, -0.4F, -0.975F, -0.4F, -0.4F, -0.975F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.975F, -0.4F, -0.4F, -0.975F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 26
		gunModel[6].setRotationPoint(4F, -5.75F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 27
		gunModel[7].setRotationPoint(7F, -5.75F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		gunModel[8].setRotationPoint(7F, -5.75F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 29
		gunModel[9].setRotationPoint(7F, -5.75F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.25F, -0.5F, -0.125F, -0.75F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.75F, 0F, -0.125F); // Box 30
		gunModel[10].setRotationPoint(0F, -5.75F, -0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.9F, -0.5F, -0.125F, -0.1F, -0.5F, -0.125F, -0.1F, -0.5F, -0.125F, -0.9F, -0.5F, -0.125F); // Box 31
		gunModel[11].setRotationPoint(0F, -4.75F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.5F, -0.25F, 0.4F, -0.875F, -0.25F, 0.4F, -0.875F, -0.25F, -0.375F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 32
		gunModel[12].setRotationPoint(0F, -6.25F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, -0.05F, -4.05F, 0F, -0.05F, -4.05F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.8F, -0.05F, -4.05F, -0.8F, -0.05F, -4.05F, -0.8F, -0.05F, 0F, -0.8F, -0.05F); // Box 34
		gunModel[13].setRotationPoint(7F, -4.75F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, -0.75F, 0F); // Box 35
		gunModel[14].setRotationPoint(5F, -4.75F, -0.5F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 41

		ammoModel[0].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -1.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -1.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -1.05F, -0.05F, -0.05F, -1.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F); // Box 41
		ammoModel[0].setRotationPoint(0F, -4.75F, -0.5F);


		slideModel = new ModelRendererTurbo[19];
		slideModel[0] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 5
		slideModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 6
		slideModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 7
		slideModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 8
		slideModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 9
		slideModel[5] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 18
		slideModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 20
		slideModel[7] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 21
		slideModel[8] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 22
		slideModel[9] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 23
		slideModel[10] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 24
		slideModel[11] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 25
		slideModel[12] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 36
		slideModel[13] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 37
		slideModel[14] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 38
		slideModel[15] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 39
		slideModel[16] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 40
		slideModel[17] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 42
		slideModel[18] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 43

		slideModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		slideModel[0].setRotationPoint(1F, -6.25F, -0.5F);

		slideModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 6
		slideModel[1].setRotationPoint(1F, -6.25F, -0.5F);

		slideModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.75F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, -0.125F, -0.75F, -0.75F, -0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 7
		slideModel[2].setRotationPoint(1F, -7F, -0.5F);

		slideModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		slideModel[3].setRotationPoint(2F, -6.25F, -0.5F);

		slideModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.75F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		slideModel[4].setRotationPoint(2F, -7F, -0.5F);

		slideModel[5].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.3F, -0.75F, 0F, -0.3F, -0.75F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		slideModel[5].setRotationPoint(4F, -6.25F, -0.5F);

		slideModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.3F, -0.125F, 0F, -0.3F, -0.125F, 0F, -0.3F, -0.125F, -0.5F, -0.3F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F); // Box 20
		slideModel[6].setRotationPoint(9F, -6.25F, -0.5F);

		slideModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.3F, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, -0.125F, -0.5F, -0.7F, -0.125F, 0F, -0.7F, 0F); // Box 21
		slideModel[7].setRotationPoint(9F, -6.25F, -0.5F);

		slideModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.7F, -0.125F, 0F, -0.7F, -0.125F, 0F, -0.7F, -0.125F, -0.5F, -0.7F, -0.125F); // Box 22
		slideModel[8].setRotationPoint(9F, -6.25F, -0.5F);

		slideModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, -0.125F, -0.5F, -0.3F, -0.125F, 0F, -0.3F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F); // Box 23
		slideModel[9].setRotationPoint(9F, -6.25F, -0.5F);

		slideModel[10].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.75F, 0F, -0.3F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 24
		slideModel[10].setRotationPoint(4F, -6.25F, -0.5F);

		slideModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F); // Box 25
		slideModel[11].setRotationPoint(9F, -5.25F, -0.5F);

		slideModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.8F, -0.45F, -0.8F, -0.8F, -0.45F, -0.8F, -0.8F, -0.45F, 0F, -0.8F, -0.45F, 0F, 0F, -0.45F, -0.55F, 0F, -0.45F, -0.55F, 0F, -0.45F, 0F, 0F, -0.45F); // Box 36
		slideModel[12].setRotationPoint(9.5F, -7.25F, -0.5F);

		slideModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.8F, -0.75F, -0.25F, -0.8F, -0.75F, -0.25F, -0.8F, -0.125F, -0.25F, -0.8F, -0.125F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F); // Box 37
		slideModel[13].setRotationPoint(2F, -7.25F, -0.5F);

		slideModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.8F, -0.125F, -0.25F, -0.8F, -0.125F, -0.25F, -0.8F, -0.75F, -0.25F, -0.8F, -0.75F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Box 38
		slideModel[14].setRotationPoint(2F, -7.25F, -0.5F);

		slideModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.9F, -0.25F, -0.25F, -0.9F, -0.25F, -0.25F, -0.9F, -0.25F, -0.25F, -0.9F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 39
		slideModel[15].setRotationPoint(2F, -7.25F, -0.5F);

		slideModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.2F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 40
		slideModel[16].setRotationPoint(1F, -6.25F, -0.5F);

		slideModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F); // Box 42
		slideModel[17].setRotationPoint(2F, -6.35F, -0.5F);

		slideModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, -0.375F, 0.1F, -0.25F, -0.375F, 0.1F, -0.25F, -0.375F, 0.1F, -0.5F, -0.375F, 0.1F, -0.5F, -0.375F, 0.1F, -0.25F, -0.375F, 0.1F, -0.25F, -0.375F, 0.1F, -0.5F, -0.375F, 0.1F); // Box 43
		slideModel[18].setRotationPoint(2.25F, -6.25F, -0.5F);



		barrelAttachPoint = new Vector3f(1F /16F, 0F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(1 /16F, 0F /16F, 0F /16F);


		gunSlideDistance = 0.15F;


		animationType = EnumAnimationType.PISTOL_CLIP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}