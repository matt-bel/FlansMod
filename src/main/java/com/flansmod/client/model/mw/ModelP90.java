package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelP90 extends ModelGun 
{
	int textureX = 512;
	int textureY = 32;

	public ModelP90() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[30];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 10
		gunModel[11] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 11
		gunModel[12] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 12
		gunModel[13] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 13
		gunModel[14] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 16
		gunModel[15] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 24
		gunModel[16] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 25
		gunModel[17] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 26
		gunModel[18] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 30
		gunModel[19] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 32
		gunModel[20] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 33
		gunModel[21] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 37
		gunModel[22] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 39
		gunModel[23] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 40
		gunModel[24] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 41
		gunModel[25] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 42
		gunModel[26] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 45
		gunModel[27] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 46
		gunModel[28] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 47
		gunModel[29] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 48

		gunModel[0].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 0
		gunModel[0].setRotationPoint(1F, -2.95F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 1
		gunModel[1].setRotationPoint(0F, -0.95F, -0.5F);

		gunModel[2].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Box 2
		gunModel[2].setRotationPoint(-4F, -2.95F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[3].setRotationPoint(1F, -1.95F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[4].setRotationPoint(0F, -1.95F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 5
		gunModel[5].setRotationPoint(-1F, -0.95F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 6
		gunModel[6].setRotationPoint(-2F, -0.95F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[7].setRotationPoint(-2F, -1.95F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[8].setRotationPoint(-2F, -2.95F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F); // Box 9
		gunModel[9].setRotationPoint(-4F, -1.95F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 10
		gunModel[10].setRotationPoint(-2F, -3.95F, -0.5F);

		gunModel[11].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 11
		gunModel[11].setRotationPoint(-7F, -3.95F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 12
		gunModel[12].setRotationPoint(3F, -2.95F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 13
		gunModel[13].setRotationPoint(3F, -2.95F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, -0.75F, 0F); // Box 16
		gunModel[14].setRotationPoint(3F, -1.95F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.25F, 0F); // Box 24
		gunModel[15].setRotationPoint(4F, -2.2F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		gunModel[16].setRotationPoint(5F, -2.95F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 26
		gunModel[17].setRotationPoint(3F, -1.95F, -0.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 30
		gunModel[18].setRotationPoint(7.5F, -3.95F, -0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		gunModel[19].setRotationPoint(-7F, -4.95F, -0.5F);

		gunModel[20].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 33
		gunModel[20].setRotationPoint(-4F, -3.95F, -0.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		gunModel[21].setRotationPoint(-3F, -3.95F, -0.5F);

		gunModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 39
		gunModel[22].setRotationPoint(6.5F, -4.95F, -0.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, -0.45F, 0F, -0.75F, -0.45F, 0F, -0.75F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 40
		gunModel[23].setRotationPoint(1F, -5.95F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, -0.8F, 0F, -0.45F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 41
		gunModel[24].setRotationPoint(1F, -5.95F, 0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, -0.45F, -0.8F, 0F, -0.45F, -0.8F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		gunModel[25].setRotationPoint(1F, -5.95F, -1.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0F, -0.8F, -0.05F, -7.75F, -0.8F, -0.05F, -7.75F, -0.8F, -0.05F, 0F, -0.8F, -0.05F, 0F, 0F, -0.05F, -7.75F, 0F, -0.05F, -7.75F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 45
		gunModel[26].setRotationPoint(1F, -6.5F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 46
		gunModel[27].setRotationPoint(6.5F, -2.95F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.75F, 0F, -0.8F, -0.75F, 0F, 0F, 0F, 0F); // Box 47
		gunModel[28].setRotationPoint(6F, -2.95F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.2F, -0.75F, 0F); // Box 48
		gunModel[29].setRotationPoint(6F, -2.95F, -0.5F);


		ammoModel = new ModelRendererTurbo[4];
		ammoModel[0] = new ModelRendererTurbo(this, 181, 24, textureX, textureY); // Box 31
		ammoModel[1] = new ModelRendererTurbo(this, 2, 5, textureX, textureY); // Box 35
		ammoModel[2] = new ModelRendererTurbo(this, 2, 5, textureX, textureY); // Box 36
		ammoModel[3] = new ModelRendererTurbo(this, 2, 5, textureX, textureY); // Box 37

		ammoModel[0].addShapeBox(0F, 0F, 0F, 50, 1, 3, 0F, 0F, -0.25F, -0.05F, -41.75F, -0.25F, -0.05F, -41.75F, -0.25F, -2.05F, 0F, -0.25F, -2.05F, 0F, 0F, -0.05F, -41.75F, 0F, -0.05F, -41.75F, 0F, -2.05F, 0F, 0F, -2.05F); // Box 31
		ammoModel[0].setRotationPoint(-2F, -4.95F, -0.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.25F, -0.05F, -0.625F, -0.25F, 0.075F, -0.625F, -0.25F, 0.075F, 0F, -0.25F, -0.05F, 0F, 0.25F, -0.05F, -0.625F, 0.25F, 0.075F, -0.625F, 0.25F, 0.075F, 0F, 0.25F, -0.05F); // Box 35
		ammoModel[1].setRotationPoint(-3F, -4.95F, -0.5F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.625F, -0.25F, 0.075F, 0F, -0.25F, -0.05F, 0F, -0.25F, 0.05F, -0.625F, -0.25F, 0.075F, -0.625F, 0.25F, 0.075F, 0F, 0.25F, -0.05F, 0F, 0.25F, -0.05F, -0.625F, 0.25F, 0.075F); // Box 36
		ammoModel[2].setRotationPoint(-3F, -4.95F, -0.5F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.375F, -0.25F, 0.075F, -0.375F, -0.25F, 0.075F, -0.375F, -0.25F, 0.075F, -0.375F, -0.25F, 0.075F, -0.375F, 0.25F, 0.075F, -0.375F, 0.25F, 0.075F, -0.375F, 0.25F, 0.075F, -0.375F, 0.25F, 0.075F); // Box 37
		ammoModel[3].setRotationPoint(-3F, -4.95F, -0.5F);



		barrelAttachPoint = new Vector3f(-6.5F /16F, -1.25F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(2F /16F, 0F /16F, 0F /16F);

		animationType = EnumAnimationType.P90;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}